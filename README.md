vertx-module-example
====================

Example showing how to properly make modules with master module including others

Clone this repo and build with maven
ping and pong modules, invoking just maven install

Then go to ping-pong and run
mvn install vertx:runMod

This will run StarterVerticle that runs both verticles Ping and Pong from both built modules.

Remeber
If you change anything in Ping or Pong it needs to be rebuilt with mvn install so it will be deployed in local m2 repo 
and then you need to rebuild ping-pong module prior to run it thus before calling vertx:runMod you need to put install 
(or at leas package) goal.

In other words, mvn vertx:runMod doesn't build module at all. It only runs already assembled vert.x module from target.
