/**
 * Sparta Software Co.
 * 2016
 */
package com.diehl.dummy;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Daniel Conde Diehl - Sparta Technology
 *
 * History:
 *  Jun 21, 2016 - Daniel Conde Diehl
 */

@RestController
public class MessagesController {

    @RequestMapping(value = "/messages", method = RequestMethod.POST)
    public @ResponseBody Answer processMessage(@RequestBody Message message) throws Exception{
        System.out.println("HERE");

        Answer a = new Answer(5);

        return a;
    }

    @ExceptionHandler
    void handleException(Exception e, HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.CONFLICT.value());
    }
}
