Feature: Shopping Cart and Address Management



  #As a user

  #I want to be able to add items to my cart and provide delivery details

  #So that I can successfully place an order



  Scenario: Navigate to cart and fill out a new delivery address

    Given the user is on the home page

    When the user navigates to the cart

    And the user clicks the Buy button

    Then the user fills in the delivery address details:

      | Full Name    | sachin                      |

      | Company      | tata consultancy services   |

      | Address      | 123 Main Street, Bangalore  |

      | Landmark     | near temple                 |

      | Country      | India                       |

      | State        | Andhra Pradesh              |

      | City         | Tenali                      |

      | Pincode      | 522201                      |

      | Mobile       | 9876543210                  |

    And the user saves the address

    Then the order should be processed successfully