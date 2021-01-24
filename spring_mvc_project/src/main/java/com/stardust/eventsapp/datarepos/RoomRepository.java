package com.stardust.eventsapp.datarepos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stardust.eventsapp.domain.Room;

public interface RoomRepository extends MongoRepository<Room, String> {

}
