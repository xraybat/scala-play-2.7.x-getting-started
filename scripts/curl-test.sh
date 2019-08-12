#!/bin/sh

curl --header "Content-type: application/json" --request POST --data '{"symbol": "GOOG", "price": 900.0}' http://localhost:9000/stock_post