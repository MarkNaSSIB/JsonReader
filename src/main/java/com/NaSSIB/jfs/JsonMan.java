package com.NaSSIB.jfs;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonMan {

  static int Write(String fileName, Film addedFilm) {

    ObjectMapper objectMapper = new ObjectMapper();
    try {
      objectMapper.writeValue(new File("target/film.json"), addedFilm);
      // System.out.println("File successfully written");
      return 1;
    } catch (StreamWriteException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (DatabindException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return 0;

  }

  static Film Read(String fileLoc) {

    ObjectMapper objectMapper = new ObjectMapper();

    Film outFilm = new Film(-1, "not a film", -1, "January 1 1970", "na");

    try {
      outFilm = objectMapper.readValue(new File(fileLoc), Film.class);
    } catch (StreamReadException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (DatabindException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    if (outFilm.isPresent() == false) {

      return outFilm;
    } else {
      return outFilm;
    }



  }

}
