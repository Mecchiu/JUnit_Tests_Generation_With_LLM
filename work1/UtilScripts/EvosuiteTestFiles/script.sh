#!/bin/bash
input="./out.txt"
while IFS= read -r line
do
  #rm "$line" 
  java -jar TestFileDetector.jar "$line" 
done < "$input"
