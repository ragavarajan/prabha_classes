Feature: Login process

@one
Scenario: Login page test
Given Browser opened
When title is targetbay
Then enter userid and pw


@three
Scenario: Home page

Given verify home page title
When execute option 1
Then executer option 2


@two
Scenario: Cart page

Given verify cart page title
When proceed to checkout
