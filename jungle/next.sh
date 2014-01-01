#!/bin/sh

next() {
  rc=$1
  continue
}

rc=0

for i in 1 2; do 
  next $i
  echo "should not get here"
done

exit $rc
