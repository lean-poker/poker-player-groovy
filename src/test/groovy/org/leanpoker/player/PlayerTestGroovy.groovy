package org.leanpoker.player

import groovy.json.JsonSlurper

/**
 * Standard groovy unit test.
 */
class PlayerTestGroovy extends GroovyTestCase {

	void testBetRequest() {
		def gameState = new JsonSlurper().parseText('{"key1": "value1", "key2": "value2"}')

		assert Player.betRequest(gameState) == 0 : "The default folding player didn't fold!"
	}
}
