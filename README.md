If the parent entity class {@link com.cfyl.kotlinquerydsl.domain.BaseJpaEntity} does NOT inherit from {@link org.springframework.data.domain.AbstractAggregateRoot},
Q classes can be generated normally.


If inheritance is present, it will cause exceptions:

~~~shell
[ksp] java.lang.IllegalStateException: Unable to resolve type of entity for org.springframework.data.domain.AbstractAggregateRoot
    ... [same exception stack trace]
    at java.base/java.lang.Thread.run(Thread.java:1583)
~~~