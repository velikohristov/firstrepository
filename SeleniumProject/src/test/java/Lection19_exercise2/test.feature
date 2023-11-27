	Feature: Magento Checkout Process

	  Scenario: User completes the checkout process
	    Given the user has items in their shopping cart
	    When the user proceeds to checkout
	    And the user provides "Veliko_Hristov" and "Password" for login
	    And the user enters shipping information
	    And the user selects payment method "ByDebitCard"
	    When the user confirms the order
	    Then the order is successfully placed