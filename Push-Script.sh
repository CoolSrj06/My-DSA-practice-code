#!/bin/bash

echo "Enter you message"
read message
git add .
git commit -m "$message"
git origin push master
