package ru.l3r8y.brokeninjection.demo

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import ru.l3r8y.brokeninjection.BrokenInjectionApplication

@SpringBootTest(classes = [BrokenInjectionApplication::class])
class AbstractRepoInitializationTest {

    @Autowired
    private lateinit var component: RepoAsComponent

    @Autowired
    private lateinit var repository: RepoAsRepository

    @Test
    fun `should initialize bean in component`() {
        assertThat(this.component.bean).isNotNull()
    }

    @Test
    fun `should initialize bean in repository`() {
        assertThat(this.repository.bean).isNotNull()
    }
}