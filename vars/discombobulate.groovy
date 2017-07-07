def call(message, username) {
	node {
		println ("Hi ${username}: Your message is: ${message}")
	}
}
