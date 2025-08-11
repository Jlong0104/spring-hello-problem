IMAGE_NAME = yourname/spring-hello-problem
IMAGE_TAG = 1.0.0
CONTAINER_NAME = spring-hello-container
PORT = 8080
build:
	docker build -t $(IMAGE_NAME):$(IMAGE_TAG) .
run:
	docker run -d --rm \
	--name $(CONTAINER_NAME) \
	-p $(PORT):8080 \
	$(IMAGE_NAME):$(IMAGE_TAG)
stop:
	docker stop $(CONTAINER_NAME)
logs:
	docker logs -f $(CONTAINER_NAME)
push:
	docker push $(IMAGE_NAME):$(IMAGE_TAG)
clean:
	docker rmi $(IMAGE_NAME):$(IMAGE_TAG)
