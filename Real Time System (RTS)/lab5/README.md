# Lab 5

## Objective

- To create Circular Buffer using array in java

## Theory

- Circular buffer is a First In First Out based 


```
Process     Brust Time      Arrival Time        Execution Period
 p1            3                0                   20
 p2            2                0                   5
 p3            2                0                   10

Gant Chart will be

p2(2) --> p3(2) --> p1(1) --> p2(2) --> p1(2) --> x(1) --> p2(2) --> p3(2) --> x(1) --> p2(2)

Here, the p2 process is executed for 2 unit of time because it has highest priority and needs to be executed 2 unit
time every 5 units of time period. Then the p3 will be executed for 2 unit of time as it has to be executed 2 unit
time every 10 units of time period. Finally p1 will executed for 1 unit of time cause after that p2 will over take
as RMA is a preemptive scheduling. And the execution goes on.
```

## Code

[here](https://github.com/college-related/Labs-7th-sems/tree/main/Real%20Time%20System%20(RTS)/lab3/RateMonotonicScheduling.java)

## Output

```

```