Feature: put requests

Scenario: user want to update the datas
Given user want to update the new datas
When user want to update the datas using api "http://localhost:8080/customers"
Then user verify the Status code is 200


