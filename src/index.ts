import { registerPlugin } from '@capacitor/core';

import type { ScreenStatePluginPlugin } from './definitions';

const ScreenStatePlugin = registerPlugin<ScreenStatePluginPlugin>('ScreenStatePlugin', {
  web: () => import('./web').then((m) => new m.ScreenStatePluginWeb()),
});

export * from './definitions';
export { ScreenStatePlugin };
