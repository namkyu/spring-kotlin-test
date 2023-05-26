package com.example.springkotlintest.domain

import jakarta.persistence.EntityManager
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.TestConstructor

// TestConstructor 를 사용하면 생성자를 통해 주입받을 수 있다.
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
@DataJpaTest
class RegionNameConverterTest(val em: EntityManager) {

    @Test
    fun testSave() {
        Region("seoul", 1, "20230101").let {
            // GenerationType.IDENTITY 인 경우 id 값을 알 수 없는 상태이기에 영속성 컨텍스트에 담지 못한다.
            // 그래서 save()와 동시에 insert query를 실행한다.
            // 테스트가 종료되면 db 상에서 rollback 을 처리한다.
            // @DataJpaTest 안에 @Transactioanl 이 포함되어 있기 때문이다.
            em.persist(it)
            em.flush()

            // 코딩시 편의 기능을 위해 let을 사용한다. (스코프 함수 let)
           em.find(Region::class.java, it.id).let { region ->
                assertEquals("seoul", region.region)
                assertEquals(1, region.dataType)
                assertEquals("20230101", region.dateTime)
            }
        }
    }
}