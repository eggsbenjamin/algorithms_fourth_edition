#!/usr/bin/env bash

set -o errexit
set -o nounset

test_chapter () {
  if [ "$#" -lt "1" ]; then
    echo "error: no chapter passed to test_chapter";
    return 1;
  fi

  for exercise in $(ls ./chapters/$chapter)
  do
    echo -e "building ./chapters/$chapter/$exercise\n"
    javac ./chapters/$chapter/$exercise/src/Main.java -d ./chapters/$chapter/$exercise

    echo -e "testing ./chapters/$chapter/$exercise\n"
    java -ea -cp ./chapters/$chapter/$exercise Main
    echo -e "\n"
  done
}

for chapter in $(ls ./chapters)
do
  test_chapter $chapter
done
