package org.acme.rest

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService {

    fun greet() = "hello pui poo"
}