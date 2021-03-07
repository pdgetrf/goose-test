#!/bin/bash


input="readme.md"

while IFS= read -r line
do
  if [[ "$line" == *"due date"* ]]; then
    duedate=`echo $line | sed 's/due date: \(.*\)/\1/'`
    echo $duedate
  fi
done < "$input"

todate=`TZ=PST8PDT date`

echo "today: $todate"

echo "due date: $duedate"

todateepoch=$(date -d "$todate" +%s)
duedateepoch=$(date -d "$duedate" +%s)

if [ "$todateepoch" -gt "$duedateepoch" ] ;
then
    echo "your late"
else
    echo "still time"
fi

exit 1
