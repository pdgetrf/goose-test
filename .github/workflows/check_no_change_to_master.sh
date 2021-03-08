#!/bin/bash

UPSTREAM=https://github.com/pdgetrf/goose-test.git

git remote add upstream $UPSTREAM 
git diff upstream/master master	 
