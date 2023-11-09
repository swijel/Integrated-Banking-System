# Integrated-Banking-System
Implement Open Banking relationship across Banks for a Retail Customer using oracle database and Spring Tool Suite (STS)
Three banks used : HDCC Bank, City Bank, Infinity Bank

"1.  Account Opening Function : APIs to OPEN New account 
- API to Submit Account details : Allows New Savings Act opening by the Customer (Name, Permanent Address, Current Address, Contact Details, Email ids, Occupation, Birthdate, PAN card no, Aadhar no, Passport no., upload PP size picture), eKYC number.
- API to get Account details :  Gets all account details for the specific customer setup in CityBank
- API to get All Account details :  Gets all account details for all customers setup in CityBank
2. Interface between Banks : EKYC check service and APIs support to support the below:
- An eKYC check service call to HDCC Bank or Infinity Bank.
- Citybank to verify eKYC number of the New Customer and expect KYC check yes/no response (if the ekyc number is present or not in HDCC/Infinity, it will respond Yes/No accordingly)
3.Show Aggregated view if all Balances across all banks. APIs support to support the below:
- Aggregated Account balance (Account balance details of HDCC/Infinity to be retreived and shown if and only if the ekyc number response was returned as ""yes"" from the respective bank for the given customer in the step #2)"						


# Tech Used:
1. Java, REST, Springboot/Microservice, JPA
2  Oracle SQL

# Toolkit:
1. Oracle Database
2. Latest version of google chrome, Internet explorer, firefox and opera
3. Apahe Tomcat Server
4. Spring Tool Suite (STS) for springboot & microservices
5. Maven
6. Postman for API testing
