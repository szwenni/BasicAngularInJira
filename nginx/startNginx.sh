#!/bin/bash
cwd=$(pwd)

docker run -v $cwd/default.conf:/etc/nginx/nginx.conf -v $cwd/../angularinjira/dist/angularinjira/:/var/www/:Z -p 8095:8080 -d --name jira-plugin-server nginx:latest