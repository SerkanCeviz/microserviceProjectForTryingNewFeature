package com.ceviz.PersonMicroservice.service;

import com.ceviz.PersonMicroservice.entity.Person;
import com.ceviz.PersonMicroservice.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    @RabbitListener(queues = "${rabbit.queue.name}")
    public void consumeFromEgitimCeviz(String message) {
//        ObjectMapper objectMapper = new ObjectMapper();
//        PersonDto personDto = objectMapper.convertValue(message, PersonDto.class);
        System.out.println("Parent Projeden Gelen Mesaj : " + message);
    }


    public Person getPersonByIdNumber(String identificationNumber) {
        return repository.findByIdentificationNumber(identificationNumber).orElseThrow();
    }
}
