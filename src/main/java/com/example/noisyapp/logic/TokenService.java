package com.example.noisyapp.logic;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Creates and validates credentials.
 */
@Service
public interface TokenService {

  String permanent(Map<String, String> attributes);

  String expiring(Map<String, String> attributes);

  /**
   * Checks the validity of the given credentials.
   *
   * @param token
   * @return attributes if verified
   */
  Map<String, String> untrusted(String token);

  /**
   * Checks the validity of the given credentials.
   *
   * @param token
   * @return attributes if verified
   */
  Map<String, String> verify(String token);
}