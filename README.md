# Spring Cloud OpenFeign bug - Form URL encoded

This repository is an example to reproduce a possible bug in new Spring Cloud OpenFeign 3.0.4 and newer.

To reproduce it, just execute the command `mvn clean integration-test` in the root of the project or run `MyFeignClientIT` from your favorite IDE.

The build will be OK. However, if you update Spring Cloud OpenFeign, `MyFeignClientIT` will fail.

It has been tested with these versions:

| Spring Boot       | Spring Cloud OpenFeign | Result |
|-------------------|------------------------|--------|
| `2.5.14`          | `3.0.3`                | ✅      |
| `2.5.14`          | `3.0.4` - `3.0.8`      | ❌      |
| `2.6.14`, `2.7.8` | `3.1.0` - `3.1.5`      | ❌      |
