# DOCKER

(1) Create Dockerfile


(2) Execute install from Maven


(3) Open Docker Desktop


(4) Build Docker image<br>

        docker build --tag <image_name>:<image_version> <Dockerfile_path>
        
    Ex: docker build --tag market_store:1.0 .


(5) Run Docker

        docker run --publish <port>:<port> <image_name>:<image_version>
        
    Ex: docker run --publish 8080:8080 market_store:1.0


(6) Start a stack of containers (docker-compose)
    
        docker-compose up -d


(7) Open the testing

        Open the webpage: http://localhost:<port>/swagger-ui/index.html
        
    Ex: http://localhost:8080/swagger-ui/index.html