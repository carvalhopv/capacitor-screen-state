export interface ScreenStatePluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
