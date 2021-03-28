package github.cronnieves.simplevertx

import java.util.*
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertNotNull


class AppTest {
    @Test fun testAppHasAGreeting() {
        val currentClassTest = App()

        assertNotNull(currentClassTest.initialMessage,
                "App no inicio")

        assertFalse(Objects.isNull(currentClassTest.initialMessage)
                    || currentClassTest.initialMessage.isEmpty(),
                "App sin mensaje de inicio")
    }
}
