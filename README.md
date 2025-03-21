# graphql_l
# Graphql Prac

## Description
Graphql Prac is a practice project designed to demonstrate the usage of GraphQL with Spring Boot. The application allows users to fetch dummy personnel data through GraphQL queries. The data is generated using a PostgreSQL procedure.

## Features
- Integration with GraphQL to query personnel data.
- Uses dummy data generated via PostgreSQL.
- Simple and straightforward setup, no database configuration required.

## Getting Started

### Prerequisites
- Java 17+
- An IDE of your choice (e.g., IntelliJ, Eclipse)
- Maven



## Usage

 ```
   http://localhost:8009/graphiql ( for base interface of GRAPH-IQL)
   ```
To test the GraphQL endpoint, use the following base query:
```graphql
{
  getAllDetails {
    srNo
    pno
    officialMobileNumber
    rankCode
    perMstWe {
      firstName
      lastName
      gender
    }
    aadharNumber
    dateOfMarriage
  }
}
```


