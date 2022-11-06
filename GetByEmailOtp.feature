Feature: GetByEmailOtp
Scenario: User want to get the single data by using EmailOtp
When User want to read the data by using the URI as "http://localhost:8080/customers/email/anpak@1717gmail.com/otp/87"
Then User want to verify the  status code as 200
