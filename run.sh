#!/bin/bash
javac LoopMaster.java || exit 1

output=$(echo 4 | java LoopMaster)

if echo "$output" | grep -q "^\*$"; then
  echo "✓ Triangle pattern check passed"
else
  echo "✗ Triangle pattern check failed"
  exit 1
fi

if echo "$output" | grep -q "Factorial: 24"; then
  echo "✓ Factorial check passed"
else
  echo "✗ Factorial check failed"
  exit 1
fi

if echo "$output" | grep -q "Countdown: 4 3 2 1"; then
  echo "✓ Countdown check passed"
else
  echo "✗ Countdown check failed"
  exit 1
fi
