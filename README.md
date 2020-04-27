# source-demo-microservices
Demo Microservices-based Web Application using Java Spring Boot, being used as the source system.

The application consits of three Microservices (MS):
1. Authentication MS: is a demo of an application front-end that handles user login (hardcoded), and multiplexes user requests to other MSs. It runs on local port 8040.

2. Authorization MS: is a demo of access control service that provides REST API check access (hardcoded), and the break/mend the glass. It runs on local port 8060.

3. Patient MS: is a demo of patient service that keeps track of patient information. It uses an in-memory DB to store patient name and disease, and provides REST API to read these information. It runs on local port 8050.
