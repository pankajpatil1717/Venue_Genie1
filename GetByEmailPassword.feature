Feature: GetByEmailPassword
Scenario: User want to get the single data by using EmailPassword
When User is able to get  data with the help of using api is "http://localhost:8080/customers/email/anpak@1717gmail.com/password/cwA+dSYIBqCuWdPCVlnUxw=="
Then User Verify the status code as 404