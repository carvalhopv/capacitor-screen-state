# capacitor-screen-state

The ScreenState plugin for CapacitorJS allows developers to detect whether a device's screen is locked or unlocked.

# Supported Platforms

| Platform | Supported |
| -------- | --------- |
| Android  | ✅        |
| iOS      | ❌        |
| Web      | ❌        |

## Install

```bash
npm install capacitor-screen-state
npx cap sync
```

## API

<docgen-index>

- [`isScreenLocked()`](#isscreenlocked)
- [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### isScreenLocked()

```typescript
isScreenLocked() => Promise<ScreenLockResult>
```

Checks if the device's screen is locked.

Available only on Android.

**Returns:** <code>Promise&lt;<a href="#screenlockresult">ScreenLockResult</a>&gt;</code>

**Since:** 1.0.0

---

### Interfaces

#### ScreenLockResult

| Prop           | Type                 | Description                             | Since |
| -------------- | -------------------- | --------------------------------------- | ----- |
| **`isLocked`** | <code>boolean</code> | Indicates whether the screen is locked. | 1.0.0 |

</docgen-api>
