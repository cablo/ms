#!/bin/bash

# publish to https://hub.docker.com/repositories/cablo
# docker login
docker images
docker push cablo/postgres-image
docker push cablo/ms-image
