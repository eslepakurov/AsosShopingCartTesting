# AsosShoppingCartTesting
Simple end-to-end test of the asos.com shopping cart

This is a simple Java + Selenium WebDriver test of the asos.com shopping cart.

The project coded in IntelliJ IDEA

Test case looks like:

Pre-requisetes:
User have an account on asos.com

Steps:
1.	Open testing URL https://www.asos.com
2.	Login with valid credentials
3.	Go to PLP
4.	Choose any product
5.	Add product to the cart
6.	Go to the cart

Expected result: The cart contains the previously added product

This test works in Google Chrome browser

I have used TestNG framework for annotations and structurize the code
I have used Page object pattern to simplify the test and make the date re-useable

Pages package contains the overview of the paje objects for all the pages we need to test with
WebDriverSettings.java is a setting-up file for the test
CartTest.java is a test file
