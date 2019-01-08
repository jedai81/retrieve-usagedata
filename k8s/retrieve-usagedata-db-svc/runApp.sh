#!/bin/sh

CMD="java $@ -jar app.jar"

echo ${CMD}
${CMD}
