package org.entur.gbfs.http;

import java.net.URI;
import org.jetbrains.annotations.Nullable;

/**
 * GBFS HTTP client response event handler.
 */
public interface GBFSHttpClientEventHandler {
  /**
   * Triggered when GBFS HTTP client request is successful, meaning producer server returned an HTTP response.
   * @param httpStatus response HTTP status
   * @param uri producer URI
   */
  void onGetDataSuccess(@Nullable Integer httpStatus, URI uri);

  /**
   * Triggered when GBFS HTTP client request failed, e.g. request timed out.
   * @param uri producer URI
   */
  void onGetDataFailure(URI uri);

  /**
   * Link a feed URI (URI returned by call to gbfs.json = discovery URI) with its discovery URI (URI to a gbfs.json file)
   * @param feedUri feed URI to link to
   * @param discoveryUri discovery URI to link with
   */
  void registerFeedUri(URI feedUri, URI discoveryUri);
}
