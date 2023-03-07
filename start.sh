#!/bin/bash
set -e

psql -U postgres taskDB < /migration-script.sql

exec "$@"
