Feature: Delete Request

Scenario: Delete Request to delete a user details by using ID in the Database
When I hit the api with delete request and end point as "http://localhost:8080/customers/84"
Then User want to verify the status code as 404 and status line as "HTTP/1.1 404 "