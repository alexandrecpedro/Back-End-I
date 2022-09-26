# DOCKER

(1) Create Dockerfile


(2) Execute install from Maven


(3) Open Docker Desktop


(4) Build Docker image
        docker build --tag <image_name>:<version> <Dockerfile_path>
    Ex: docker build --tag market_store:1.0 .


(5) Settings for test (Creating all info from docker-compose)
        docker-compose up --build


(6) Run Docker
        docker run --publish <port>:<port> <image_name>:<version>
    Ex: docker run --publish 8080:8080 market_store:1.0


(7) Access for testing
        Open the webpage: http://localhost:<port>/swagger-ui/index.html
    Ex: http://localhost:8080/swagger-ui/index.html
