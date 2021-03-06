#!/bin/bash


input="readme.md"

while IFS= read -r line
do
  if [[ "$line" == *"due date"* ]]; then
    duedate=`echo $line | sed 's/due date: \(.*\)/\1/'`
    echo $duedate
  fi
done < "$input"

date=`date`

todateepoch=$(date -d "$date" +%s)

duedateepoch=$(date -d "$duedate" +%s)

echo "$duedate - $todate" 

if [ "$todateepoch" > "$duedateepoch" ] ;
then
    echo "your late"
fi

