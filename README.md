# garbage-guru-recommender-api
Implementation of a Knowledge Base using Drools and Java for course "Applied AI"


## Running the API
1. **Build the Docker image**:

   ```bash
   docker build -t garbage-guru-api:latest .
   ```

2. **Run the Docker container**:

   ```bash
   docker run -it -p 81:8080  garbage-guru-api:latest 
   ```

   This will run the Flask app inside a Docker container, exposing it on port 81.