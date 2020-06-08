#!/bin/bash

docker run -d --name redis -p 6379:6379 --restart unless-stopped -d redis redis-server