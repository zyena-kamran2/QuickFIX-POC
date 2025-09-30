# FIX Protocol: Building a Trading System using Java and Spring Boot

This project is a part of the tutorial series by Achraf Hasbi, where we build a FIX Initiator using Java, Spring Boot, and QuickFIX/J.

## Prerequisites

- Java 21
- Spring Boot 3.5.5

## Getting Started

1. Clone the repository:
   ```bash
   git clone
   ```
 
2. Download and run FIXimulator as the mock acceptor from:
   ```bash
   http://fiximulator.org/
   ```
   
3. Set up the project structure and dependencies using Maven or Gradle.
4. FIX Initiator has the following components:
    - Application
    - MessageFactory
    - SessionSettings
    - LogFactory
    - MessageStoreFactory
5. Everything is wired up together in the `InitiatorConfiguration` class.
6. Orders/Responses sent and received using the `OrderController` class.
7. Messages Handling in the `InitiatorService` class.

## Dependencies

- `quickfixj-spring-boot-starter` (v3.3.0)
- `quickfixj-messages-fix42`