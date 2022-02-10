package com.dinesh;

import org.springframework.stereotype.Controller;

record User(String name, String location, Integer id, Integer salary) {}