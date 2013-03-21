#!/bin/bash
set -ex
rm -rf $JENKINS_HOME/plugins/jslint-checkstyle*
cp target/*.hpi $JENKINS_HOME/plugins/
