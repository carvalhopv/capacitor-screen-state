export interface ScreenStatePlugin {
  /**
   * Checks if the device's screen is locked.
   *
   * Available only on Android.
   *
   * @since 1.0.0
   */
  isScreenLocked(): Promise<ScreenLockResult>;
}

/**
 * @since 1.0.0
 */
export interface ScreenLockResult {
  /**
   * Indicates whether the screen is locked.
   *
   * @since 1.0.0
   */
  isLocked: boolean;
}
