package com.test.onesignal;

import androidx.annotation.NonNull;

import java.util.UUID;

class TypeAsserts {

   static void assertIsUUID(@Nullable String value) {
      UUID.fromString(value);
   }
}
