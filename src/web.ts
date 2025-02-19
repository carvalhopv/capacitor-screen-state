import { WebPlugin } from '@capacitor/core';

import type { ScreenStatePluginPlugin } from './definitions';

export class ScreenStatePluginWeb extends WebPlugin implements ScreenStatePluginPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
